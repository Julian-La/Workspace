package weatherAPI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Weather_API_Program {

	private String message;
	private String locationCall;
	private String temperatureCall;
	private JTextField cityTF = new JTextField();
	private JTextField abbreviationTF = new JTextField();
	private JButton searchButton = new JButton("Search temperature");
	private JLabel resultTemp;
	private JLabel cityInfo;
	private JLabel abbreviationInfo;
	private float tempInKelvin;
	private float tempInDegreeCelsius;
	private DocumentBuilderFactory factory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private NodeList temperatures;
	private NodeList locations;
	private Node temperature;
	private Node location;
	private NamedNodeMap tempAttributes;
	private NamedNodeMap locAttributes;

	public static void main(String[] args) throws Throwable {
		new Weather_API_Program();
	}

	public Weather_API_Program() throws Throwable, Exception {
		
		JFrame weatherFrame = new JFrame();
		weatherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		weatherFrame.setBounds(0, 0, 2000, 1500);
		weatherFrame.setLayout(null);

		cityInfo = new JLabel("City name:");
		abbreviationInfo = new JLabel("Abbr. :");
		resultTemp = new JLabel();

		cityTF.setFont(new Font("Arial", Font.PLAIN, 70));
		abbreviationTF.setFont(new Font("Arial", Font.PLAIN, 70));
		searchButton.setFont(new Font("Arial", Font.PLAIN, 50));
		cityInfo.setFont(new Font("Arial", Font.PLAIN, 50));
		abbreviationInfo.setFont(new Font("Arial", Font.PLAIN, 50));
		resultTemp.setFont(new Font("Arial", Font.PLAIN, 60));
		
		cityTF.setBounds(200,200,700,90);
		cityTF.setHorizontalAlignment(JTextField.CENTER);
		abbreviationTF.setBounds(920,200,200,90);
		abbreviationTF.setHorizontalAlignment(JTextField.CENTER);
		searchButton.setBounds(200,300, 700,90);
		cityInfo.setBounds(200,120,300,90);
		abbreviationInfo.setBounds(920,120,300,90);
		resultTemp.setBounds(200,400,1700,90);

		weatherFrame.add(searchButton);
		weatherFrame.add(resultTemp);
		weatherFrame.add(cityTF);
		weatherFrame.add(abbreviationTF);
		weatherFrame.add(cityInfo);
		weatherFrame.add(abbreviationInfo);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!cityTF.getText().equals("") && !abbreviationTF.getText().equals("")) {
					String cityName = cityTF.getText();
					String cityAbbreviation = abbreviationTF.getText();
					setWeather(cityName, cityAbbreviation);
					resultTemp.setText(message);
					resultTemp.setVisible(true);
					System.out.println(getCity());
				}
			}
		});

		weatherFrame.setVisible(true);
		searchButton.setVisible(true);
	}
	
	private void setWeather(String cityName, String cityAbbreviation) {
		String uri = "http://api.openweathermap.org/data/2.5/weather?q="+encodeURLParameter(cityName)+","+encodeURLParameter(cityAbbreviation)+"&mode=xml&APPID=ef736066f9599e3640fc037f874b666d";
		factory = DocumentBuilderFactory.newInstance();
		try {
			documentBuilder = factory.newDocumentBuilder();
			document = documentBuilder.parse(uri);
			message = "The temperature in "+getCity()+" is "+ getTemp() + " °C.";
		} catch (ParserConfigurationException | SAXException | IOException e) {
			message = cityName+" is not available at openweathermap.org.";
		}
	}
	
	private String encodeURLParameter(String parameter) {
		try {
			return URLEncoder.encode(parameter, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Should never happen", e);
		}
	}
		
	private String getTemp() {
		temperatures = document.getElementsByTagName("temperature");
		temperature = temperatures.item(0);
		tempAttributes = temperature.getAttributes();
		temperatureCall = tempAttributes.getNamedItem("value").getNodeValue();
		tempInKelvin = Float.parseFloat(temperatureCall);
		tempInDegreeCelsius = tempInKelvin- 273.15f;
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(tempInDegreeCelsius);
	}
		
	private String getCity() {
		locations = document.getElementsByTagName("city");
		location = locations.item(0);
		locAttributes = location.getAttributes();
		locationCall = locAttributes.getNamedItem("name").getNodeValue();
		return locationCall;
	}
}
		/**
		 * Geklärt:
		 * Generell: Wieso starte ich immer mit Mainmethode {new class}. Wie macht man das eig. richtig? Weil die Mainmethode sonst nix zu tun hat und weil sonst alles static wäre (???). 
		 * -> Bei 2 Klassen in der Main, sinds 2 Programme. Z.B. kann man dann 2 JFrames mit den gleichen Inhalt starten.
		 * Fragen an Tano:
		 * Generell: Wieso musste ich bei der Main nicht "extends JFrame {" schreiben? Extrends JFrame, man nimmt seine Klasse als Behälter her. Ganz genau unterscheiden bitte.
		 * Wieso muss ich nochmal einen constructor for Weather_API_Program bauen? In anderen Programmen musste ich das nicht? Ganz vertieft warum.
		 * Gibt es ein universales Main-Method-Pattern? Irgendwas was mir immer eine gewisse Struktur gibt, wie eine Vorlage?
		 * !!! Github, wann erstelle ich releases? Man sagt, Personen ohne Account könnnen sich dann diesen release runterladen? 
		 */
		
		
		
		
		
		
		

			

	

