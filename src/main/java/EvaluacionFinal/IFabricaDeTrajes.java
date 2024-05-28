
package EvaluacionFinal;


/*
u20232218172
Román Alberto Bolaños Cerquera
*/
public interface IFabricaDeTrajes {
    void escribirMenu();
    
    void añadirComponenteAlmacen() throws IdException, MuchoExtracomunitarioException, MangaException;
    
    void listarComponentes();
    
    void añadirTrajeAlmacen() throws ColoresException, TallaException, TrajeYaExisteException;
    
    void listarTrajes();
    
    void activarDesactivarRebajas();
    
    void crearEnvio();
    
    void crearComponentesDePrueba();

    public static class ColoresException extends Exception {

        public ColoresException() {
        }

        ColoresException(String los_componentes_no_tienen_colores_amigos) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class IdException extends Exception {

        public IdException() {
        }

        IdException(String el_ID_ya_existe) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class MangaException extends Exception {

        public MangaException() {
        }

        MangaException(String debe_existir_una_blusa_de_manga_corta_del) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class MuchoExtracomunitarioException extends Exception {

        public MuchoExtracomunitarioException() {
        }

        MuchoExtracomunitarioException(String no_se_pueden_añadir_más_componentes_extra) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class TallaException extends Exception {

        public TallaException() {
        }

        TallaException(String los_componentes_no_tienen_la_misma_talla) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class TrajeYaExisteException extends Exception {

        public TrajeYaExisteException() {
        }

        TrajeYaExisteException(String el_traje_ya_existe_en_el_almacén) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    
    }

