package flyway.bootstrap;

import flyway.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
            log.info(bookRepository.findAll().toString());
    }
}
