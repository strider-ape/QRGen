import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

public class QRGen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String filePath = "C:/Users/USER/Desktop/dump/qr-code.png";
        int width = 300;
        int height = 300;

        try {
            BitMatrix matrix = new MultiFormatWriter().encode(
                    text, BarcodeFormat.QR_CODE, width, height
            );
            Path path = Paths.get(filePath);

            MatrixToImageWriter.writeToPath(matrix,"png", path);

            System.out.println();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
