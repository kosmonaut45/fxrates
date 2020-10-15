package lt.augustas.fxrates.task.repository;

import lt.augustas.fxrates.task.entity.database.FxRateDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FxRateRepository extends JpaRepository<FxRateDAO, Long> {
    FxRateDAO getByExchangeCurrency(String currency);
}
