package pe.edu.utp.electroplus.repository;

import java.util.List;
import pe.edu.utp.electroplus.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer> {
    @Query(value = "SELECT o FROM Pedido o WHERE o.clienteId=?1")
    List<Pedido> findItemsByCliente(Long clienteId);
}
