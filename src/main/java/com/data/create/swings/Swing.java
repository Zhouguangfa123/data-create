package com.data.create.swings;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class Swing {
    private static final String PLUS_STR = "\\+";

    private static final String SPACE_ENCODE_STR = "%20";

    private static final String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCGc4f2OWHq8yBp4Og/GWCloPXXY4SgAYsV1tgUNqxRYA84Q0JnXAGSbOwO7bFhVhqGlVrl2JvuZoj2wL4g6UqpWdGL4d2fjMaZz4cN/U3p4PZhb2sqd7w6MCAldGOlv+qPvm9O2HYXGN31E9uDCbGp6todj2rN8Y8OMKgQUleiXb/x5wPQ9EEq25Y+kNcT+nxpXIp4R5ORfR7uTmjBZyg1f+bf6ssRMenmFlcEFUmMhoCUOGABpSe3yyQ7+HP8z3MXCrMxvGWFopufkWxEk3LsEW8sYWoOaiQXiT/gpIt4TFSDXXl62bb5hJP6WxvcjzwRYM11zfKBdSIFDVSzKuhDAgMBAAECggEAHWvIk7vIzoX3UNPzXmNqP7QyN7jCO9U6n0PNMtcn7AKuMeyd6ko62dTV7wpaZ2dVFKA4LNWygX+UdxKESGVkfhx2ezqoqZI/n0bHUetdElG0+GtOMxPSb5U6Y5fNema9qEjOyJ0bckBxyYBX55vGcd0/b3qDr58tY7iH/lJWdOPnk4b49qBUP+eI5zhuKK7Kq/GXTJeF5zsJGdPIEcPyeGRhcvdf4F4HsBAVuRKky6dsA6bxkwN/UoCES2/ejOOQiHX8vNQ4wQlT/OMkVgT6Qk/OgFxCHvCc6cPSfaybQoTI039t8bGPS48KDjOxpVsQhGu6DBxr/ZAo7Xr3xsAqwQKBgQDFbOdKf3hjqqYJ1osaat99V6/KeUTyMFMsNIh0qiXiUbmZpLFMh2hN5Gaa25T2ZB6oL9mZkXj0SZRNRDehXQ2tISUjVUho+4fOvQ40Lo15bkYFqJ45Mu1boXcEkMioI88KfpbVIOLC/o9c2qJFbi2SuT2Lbpdb27C8yJGK4O7n4QKBgQCuV4pqsTH7hZqfsJAFb84Ndiu4HuCZAwl9QFFV1SurUAZ18W6ag+X9ytEaKIfJ80uX3BRHe7P8oNMOhUpK+q/8eg49m36LN503/Ilx8B7ISgIFfjcSBnopXfoqAWuWzQkuPNLBP/b4mgDqIOwpZr8YcJI/HxJQR4we39bSziXEowKBgHtfug5RKG/IRaiiPR2OKgnPUVjLfe2Hi4J1dczKQ5ByF/VO+Ulk2SbME960WBu9p3bdKDOSuC6ZCKdceRNK7nAB5Y52DiElBtKITKcJbHm1EucYX4BJNhFsDs94lxyT/B+HykR4H51RrU+OhZez6aDmR/KpcscBvCnNgT5zoHihAoGBAKWgiuJjZr2yJrxw69IObq4BRvWLeApFhV1Vni+x7eO5ifnAnTfz+KqMZOy59o7YMUebEDT9A3gMfZX88SCcWla8ygyjTawK8LTAmP8ChOv4y0TWrJDWUHY+TqxbXxALyB4CMKLhFssE27uR/Wozr3YTdAy9gxN7dVXbh2YL7HuLAoGAO/WF5UJgYowmOZg/gx8KJfnIYLlZeAK2tSf/fU23oLET5JJGi85gRUctmILqjV+qiZX4MRY+8raoFVgSTi11VWzwQHDdwO5ErQm54btUJx4Rsaj3Pe7NYPcJ+9AKYnGxsCSZwmKf/TCHmrDipnM0mv0Bai6nWw00MM6gzDhYvR4=";

    private static final String enc = "UTF-8";

    private static final String SHA_256_WITH_RSA = "SHA256withRSA";

    private static final String httpMethod = "POST";

    private static final String timeString = "2019-12-06T16:01:09+01:00";

    private static final String clientId = "SO_UAT_SuperMerchant";

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Signature tool");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(3);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout((LayoutManager)null);
        JLabel apiLabel = new JLabel("API:");
        apiLabel.setBounds(10, 20, 80, 25);
        panel.add(apiLabel);
        final JTextField apiText = new JTextField(20);
        apiText.setBounds(150, 20, 165, 25);
        panel.add(apiText);
        JLabel contentLabel = new JLabel("Request content:");
        contentLabel.setBounds(10, 50, 120, 25);
        panel.add(contentLabel);
        final JTextArea jta = new JTextArea("", 7, 30);
        JScrollPane jsp = new JScrollPane(jta);
        Dimension size = jta.getPreferredSize();
        jsp.setBounds(150, 50, size.width, size.height);
        panel.add(jsp);
        JLabel signatureLabel = new JLabel("Signature:");
        signatureLabel.setBounds(10, 250, 80, 25);
        panel.add(signatureLabel);
        final JTextField signatureField = new JTextField(20);
        signatureField.setBounds(150, 250, 500, 25);
        panel.add(signatureField);
        JButton generateButton = new JButton("generate");
        generateButton.setBounds(10, 200, 120, 25);
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String payload = "POST " + apiText.getText() + "\n" + "SO_UAT_SuperMerchant" + "." + "2019-12-06T16:01:09+01:00" + "." + jta.getText();
                    String temp = doSign(payload, "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCGc4f2OWHq8yBp4Og/GWCloPXXY4SgAYsV1tgUNqxRYA84Q0JnXAGSbOwO7bFhVhqGlVrl2JvuZoj2wL4g6UqpWdGL4d2fjMaZz4cN/U3p4PZhb2sqd7w6MCAldGOlv+qPvm9O2HYXGN31E9uDCbGp6todj2rN8Y8OMKgQUleiXb/x5wPQ9EEq25Y+kNcT+nxpXIp4R5ORfR7uTmjBZyg1f+bf6ssRMenmFlcEFUmMhoCUOGABpSe3yyQ7+HP8z3MXCrMxvGWFopufkWxEk3LsEW8sYWoOaiQXiT/gpIt4TFSDXXl62bb5hJP6WxvcjzwRYM11zfKBdSIFDVSzKuhDAgMBAAECggEAHWvIk7vIzoX3UNPzXmNqP7QyN7jCO9U6n0PNMtcn7AKuMeyd6ko62dTV7wpaZ2dVFKA4LNWygX+UdxKESGVkfhx2ezqoqZI/n0bHUetdElG0+GtOMxPSb5U6Y5fNema9qEjOyJ0bckBxyYBX55vGcd0/b3qDr58tY7iH/lJWdOPnk4b49qBUP+eI5zhuKK7Kq/GXTJeF5zsJGdPIEcPyeGRhcvdf4F4HsBAVuRKky6dsA6bxkwN/UoCES2/ejOOQiHX8vNQ4wQlT/OMkVgT6Qk/OgFxCHvCc6cPSfaybQoTI039t8bGPS48KDjOxpVsQhGu6DBxr/ZAo7Xr3xsAqwQKBgQDFbOdKf3hjqqYJ1osaat99V6/KeUTyMFMsNIh0qiXiUbmZpLFMh2hN5Gaa25T2ZB6oL9mZkXj0SZRNRDehXQ2tISUjVUho+4fOvQ40Lo15bkYFqJ45Mu1boXcEkMioI88KfpbVIOLC/o9c2qJFbi2SuT2Lbpdb27C8yJGK4O7n4QKBgQCuV4pqsTH7hZqfsJAFb84Ndiu4HuCZAwl9QFFV1SurUAZ18W6ag+X9ytEaKIfJ80uX3BRHe7P8oNMOhUpK+q/8eg49m36LN503/Ilx8B7ISgIFfjcSBnopXfoqAWuWzQkuPNLBP/b4mgDqIOwpZr8YcJI/HxJQR4we39bSziXEowKBgHtfug5RKG/IRaiiPR2OKgnPUVjLfe2Hi4J1dczKQ5ByF/VO+Ulk2SbME960WBu9p3bdKDOSuC6ZCKdceRNK7nAB5Y52DiElBtKITKcJbHm1EucYX4BJNhFsDs94lxyT/B+HykR4H51RrU+OhZez6aDmR/KpcscBvCnNgT5zoHihAoGBAKWgiuJjZr2yJrxw69IObq4BRvWLeApFhV1Vni+x7eO5ifnAnTfz+KqMZOy59o7YMUebEDT9A3gMfZX88SCcWla8ygyjTawK8LTAmP8ChOv4y0TWrJDWUHY+TqxbXxALyB4CMKLhFssE27uR/Wozr3YTdAy9gxN7dVXbh2YL7HuLAoGAO/WF5UJgYowmOZg/gx8KJfnIYLlZeAK2tSf/fU23oLET5JJGi85gRUctmILqjV+qiZX4MRY+8raoFVgSTi11VWzwQHDdwO5ErQm54btUJx4Rsaj3Pe7NYPcJ+9AKYnGxsCSZwmKf/TCHmrDipnM0mv0Bai6nWw00MM6gzDhYvR4=", "UTF-8");
                    String signature = "signature=" + URLEncoder.encode(temp, "UTF-8").replaceAll("\\+", "%20");
                    signatureField.setText(signature);
                } catch (Exception ex) {
                    return;
                }
            }

            private String doSign(String payload, String privateKey, String charset) {
                try {
                    PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
                    Signature signature = Signature.getInstance("SHA256withRSA");
                    signature.initSign(priKey);
                    signature.update(payload.getBytes(charset));
                    byte[] signed = signature.sign();
                    return new String(Base64.getEncoder().encode(signed));
                } catch (Exception e) {
                    return null;
                }
            }

            public  byte[] toByteArray(InputStream is) throws IOException {
                ByteArrayOutputStream output = new ByteArrayOutputStream();

                try {
                    byte[] b = new byte[4096];
                    int n;
                    while((n = is.read(b)) != -1) {
                        output.write(b, 0, n);
                    }

                    byte[] var4 = output.toByteArray();
                    return var4;
                } finally {
                    output.close();
                }
            }

            private PrivateKey getPrivateKeyFromPKCS8(String algorithm, ByteArrayInputStream ins) {
                try {
                    KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
                    byte[] encodedKey = toByteArray(ins);
                    encodedKey = Base64.getDecoder().decode(encodedKey);
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(encodedKey));
                } catch (IOException iOException) {

                } catch (InvalidKeySpecException invalidKeySpecException) {

                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
        panel.add(generateButton);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Swing.createAndShowGUI();
            }
        });
    }
}

