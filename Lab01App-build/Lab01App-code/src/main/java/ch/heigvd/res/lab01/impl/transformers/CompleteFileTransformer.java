package ch.heigvd.res.lab01.impl.transformers;

import ch.heigvd.res.lab01.impl.filters.FileNumberingFilterWriter;
import ch.heigvd.res.lab01.impl.filters.UpperCaseFilterWriter;
import java.io.Writer;

/**
 * This class returns a writer decorated with two filters: an instance of the
 * UpperCaseFilterWriter and an instance of the FileNumberingFilterWriter. When an
 * instance of this class is passed to a file system explorer, it will generate an
 * output file with 1) uppercase letters and 2) line numbers at the beginning of each
 * line.
 *
 * @author Olivier Liechti
 */
public class CompleteFileTransformer extends FileTransformer {

    @Override
    public Writer decorateWithFilters(Writer writer) {
        // Decorate with the FileNumbering and UpperCase filters
        writer = new FileNumberingFilterWriter(new UpperCaseFilterWriter(writer));
        return writer;
    }

}
