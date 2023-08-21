class Test
{
  static BigInteger modulus (BigInteger p, BigInteger q)
  {
    return p.multiply (q);
  }
  static BigInteger Euler (BigInteger p, BigInteger q)
  {
    BigInteger j = new BigInteger ("1");
    return (p.subtract (j)).multiply (q.subtract (j));
  }
}

public class Drsa extends Application
{
  @Override public void start (Stage stage)
  {
    Test t = new Test ();
    Text textKey = new Text ("KEY GENERATION");
      textKey.setFont (Font.
		       font ("verdana", FontWeight.BOLD, FontPosture.REGULAR,
			     40));
      textKey.setFill (Color.BROWN);
      textKey.setStrokeWidth (2);
      textKey.setStroke (Color.BLUE);
    Text textEnc = new Text ("ENCRYPTION");
      textEnc.setFont (Font.
		       font ("verdana", FontWeight.BOLD, FontPosture.REGULAR,
			     40));
      textEnc.setFill (Color.RED);
      textEnc.setStrokeWidth (2);
      textEnc.setStroke (Color.BLUE);
    Text textDec = new Text ("DECRYPTION");
      textDec.setFont (Font.
		       font ("verdana", FontWeight.BOLD, FontPosture.REGULAR,
			     40));
      textDec.setFill (Color.BROWN);
      textDec.setStrokeWidth (2);
      textDec.setStroke (Color.BLUE);
    Label lb1 = new Label (" Enter P:");
      lb1.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt1 = new TextField ();
    Label lb2 = new Label (" Enter Q:");
      lb2.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt2 = new TextField ();
    Label lb3 = new Label ();
    Label lb4 = new Label (" N Value:");
      lb4.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt4 = new TextField ();
    Label lb5 = new Label (" N&:");
    TextField txt5 = new TextField ();
      lb5.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    Label lb6 = new Label (" E value:");
      lb6.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt6 = new TextField ();
    Label lb7 = new Label (" D value:");
      lb7.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt7 = new TextField ();
    Label lb8 = new Label ("Public Key(E,N)");
      lb8.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txte8 = new TextField ();
    TextField txtn8 = new TextField ();
    Label lb9 = new Label ("Private Key(D):");
      lb9.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #ff0000;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txt9 = new TextField ();
    Label lbMes = new Label (" Message:");
      lbMes.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtMes = new TextField ();
    Label lbA = new Label (" A:");
      lbA.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtA = new TextField ();
    Label lbB = new Label (" B:");
      lbB.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtB = new TextField ();
    Label lbH = new Label (" H:");
      lbH.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtH = new TextField ();
    Button button = new Button ("Calculate Key's");
      button.
      setStyle
      ("-fx-background-color: #ffff00;-fx-text-fill: #ff0000; -fx-border-color: #000000; -fx-border-width: 
1px;");
    Button button1 = new Button ("ENCRYPT");
      button1.
      setStyle
      ("-fx-background-color: #ffff00;-fx-text-fill: #ff0000; -fx-border-color: #000000; -fx-border-width: 
1px;");
    Label lbDecA = new Label ("Enter A:");
      lbDecA.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtDecA = new TextField ();
    Label lbDecB = new Label ("Enter B:");
      lbDecB.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtDecB = new TextField ();
    Label lbDecH = new Label ("Enter H:");
      lbDecH.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtDecH = new TextField ();
    Label lbDecD = new Label ("Enter D:");
      lbDecD.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtDecD = new TextField ();
    Label lbDecM = new Label ("Decrypt Message:");
      lbDecM.
      setStyle
      ("-fx-font: 15px Tahoma;-fx-text-fill: #00ff00;-fx-stroke: black;-fx-stroke-width: 1");
    TextField txtDecM = new TextField ();
    Button button2 = new Button ("DECRYPT");
      button2.
      setStyle
      ("-fx-background-color: #ffff00;-fx-text-fill: #ff0000; -fx-border-color: #000000; -fx-border-width: 
1px;");
    GridPane gridPane = new GridPane ();
      gridPane.
      setStyle
      ("-fx-background-image: url('https://wallpapercave.com/wp/wp1280676.jpg')");
      gridPane.add (textKey, 2, 0);
      gridPane.add (lb1, 0, 1);
      gridPane.add (txt1, 1, 1);
      gridPane.add (lb2, 0, 2);
      gridPane.add (txt2, 1, 2);
      gridPane.add (lb4, 0, 3);
      gridPane.add (txt4, 1, 3);
      gridPane.add (lb5, 0, 4);
      gridPane.add (txt5, 1, 4);
      gridPane.add (lb6, 0, 5);
      gridPane.add (txt6, 1, 5);
      gridPane.add (button, 1, 6);
      gridPane.add (lb8, 0, 7);
      gridPane.add (txte8, 1, 7);
      gridPane.add (txtn8, 2, 7);
      gridPane.add (lb9, 0, 8);
      gridPane.add (txt9, 1, 8);
      gridPane.add (textEnc, 1, 9);
      gridPane.add (textDec, 4, 9);
      gridPane.add (lbMes, 0, 10);
      gridPane.add (txtMes, 1, 10);
      gridPane.add (lbA, 0, 11);
      gridPane.add (txtA, 1, 11);
      gridPane.add (lbB, 0, 12);
      gridPane.add (txtB, 1, 12);
      gridPane.add (lbH, 0, 13);
      gridPane.add (txtH, 1, 13);
      gridPane.add (button1, 1, 14);
      gridPane.add (lbDecA, 3, 10);
      gridPane.add (txtDecA, 4, 10);
      gridPane.add (lbDecB, 3, 11);
      gridPane.add (txtDecB, 4, 11);
      gridPane.add (lbDecH, 3, 12);
      gridPane.add (txtDecH, 4, 12);
      gridPane.add (lbDecD, 3, 13);
      gridPane.add (txtDecD, 4, 13);
      gridPane.add (lbDecM, 3, 14);
      gridPane.add (txtDecM, 4, 14);
      gridPane.add (button2, 4, 15);
      gridPane.setHgap (10);
      gridPane.setVgap (10);
      button.setOnAction (new EventHandler < ActionEvent > ()
			  {
			  public void handle (ActionEvent event)
			  {
			  BigInteger p = new BigInteger (txt1.getText ());
			  BigInteger q = new BigInteger (txt2.getText ());
			  BigInteger n = t.modulus (p, q);
			  txt4.setText (String.valueOf (n));
			  BigInteger phin = t.Euler (p, q);
			  txt5.setText (String.valueOf (phin));
			  BigInteger E =
			  new
			  BigInteger
			  ("481562733369321329725315214636406979333550049489386650041523");
			  txt6.setText (String.valueOf (E));
			  BigInteger d = E.modInverse (phin);
			  txt7.setText (String.valueOf (d));
			  txte8.setText (String.valueOf (E));
			  txtn8.setText (String.valueOf (n));
			  txt9.setText (String.valueOf (d));}
			  });
    button1.setOnAction (new EventHandler < ActionEvent > ()
			 {
			 public void handle (ActionEvent event)
			 {
			 BigInteger i = new BigInteger ("1");
			 BigInteger hun = new BigInteger ("100");
			 BigInteger k =
			 new
			 BigInteger
			 ("601364434295606097009481175915561437988342009712609676717674");
			 BigInteger K = k.add (i);
			 BigInteger m = new BigInteger (txtMes.getText ());
			 BigInteger e = new BigInteger (txt6.getText ());
			 BigInteger ne = new BigInteger (txt4.getText ());
			 BigInteger A = k.modPow (e, ne);
			 txtA.setText (String.valueOf (A));
			 BigInteger B =
			 ((m.modPow (i, ne)).multiply (K.modPow (e, ne))).
			 modPow (i, ne); txtB.setText (String.valueOf (B));
			 BigInteger H = (m.modPow (k, hun));
			 txtH.setText (String.valueOf (H));}
			 });
    button2.setOnAction (new EventHandler < ActionEvent > ()
			 {
			 public void handle (ActionEvent event)
			 {
			 BigInteger i = new BigInteger ("1");
			 BigInteger a = new BigInteger (txtDecA.getText ());
			 BigInteger b = new BigInteger (txtDecB.getText ());
			 BigInteger n = new BigInteger (txt4.getText ());
			 BigInteger d = new BigInteger (txt7.getText ());
			 BigInteger e = new BigInteger (txt6.getText ());
			 BigInteger k = (a.modPow (d, n));
			 BigInteger K = k.add (i);
			 BigInteger Einv = e.negate ();
			 BigInteger M =
			 ((b.modPow (i, n)).multiply (K.modPow (Einv, n))).
			 modPow (i, n); txtDecM.setText (String.valueOf (M));}
			 });
    Scene scene = new Scene (gridPane, 200, 100, Color.BEIGE);
    stage.setTitle ("DRSA CRYPTOSYSTEM");
    stage.setScene (scene);
    stage.show ();
  }
  public static void main (String args[])
  {
    launch (args);
}}
