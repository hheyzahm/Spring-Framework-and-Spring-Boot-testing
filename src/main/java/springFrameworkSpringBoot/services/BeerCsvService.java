package springFrameworkSpringBoot.services;

import springFrameworkSpringBoot.Model.BeerCSVRecord;

import java.io.File;
import java.util.List;

/**
 * @Created 27 03 2023 - 11:13 AM
 * @Author Hazeem Hassan
 */
public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}