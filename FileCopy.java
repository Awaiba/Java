import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Define the paths of the source and destination files
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Create file objects for the source and destination files
        File source = new File(sourceFile);
        File destination = new File(destinationFile);

        // Declare file input and output streams
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Initialize file input and output streams
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);

            // Define a buffer for reading from the source file
            byte[] buffer = new byte[1024];
            int length;

            // Read from the source file into the buffer and write to the destination file
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            // Output message indicating successful copy
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close file streams in the finally block to ensure they are closed regardless of exceptions
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
