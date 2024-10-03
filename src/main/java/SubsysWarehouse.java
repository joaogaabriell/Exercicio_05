public class SubsysWarehouse {

    public int verificarEstoque(String item) {
        // Lógica para verificar o estoque de um item
        return 20; // Exemplo: 20 unidades em estoque
    }

    public boolean realizarPedidoCompra(String item, int quantidade) {
        // Lógica para realizar pedido de compra
        System.out.println("Pedido realizado para " + quantidade + " unidades de " + item);
        return true; // Sucesso na realização do pedido
    }
}
