package com.filehandling;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Read all lines from a file as a {@code Stream}. Bytes from the file are
 * decoded into characters using the {@link StandardCharsets#UTF_8 UTF-8}
 * {@link Charset charset}.
 *
 * <p>
 * The returned stream contains a reference to an open file. The file is closed
 * by closing the stream.
 *
 * <p>
 * The file contents should not be modified during the execution of the terminal
 * stream operation. Otherwise, the result of the terminal stream operation is
 * undefined.
 *
 * <p>
 * This method works as if invoking it were equivalent to evaluating the
 * expression:
 * 
 * <pre>
 * {@code
 * Files.lines(path, StandardCharsets.UTF_8)
 * }
 * </pre>
 *
 * @apiNote This method must be used within a try-with-resources statement or
 *          similar control structure to ensure that the stream's open file is
 *          closed promptly after the stream's operations have completed.
 *
 * @param path the path to the file
 *
 * @return the lines from the file as a {@code Stream}
 *
 * @throws IOException       if an I/O error occurs opening the file
 * @throws SecurityException In the case of the default provider, and a security
 *                           manager is installed, the
 *                           {@link SecurityManager#checkRead(String) checkRead}
 *                           method is invoked to check read access to the file.
 *
 * @since 1.8
 * 
 * About lines method
 */

public class FileHandlingClass {
	public static void main(String[] args) {

		try {
			Files.lines(Paths.get("/Users/namdev_akash/Downloads/akash.txt"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
