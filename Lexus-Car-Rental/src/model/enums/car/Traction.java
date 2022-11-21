package model.enums.car;

/**
 *
 * @author Felipe Kellermann
 */
public enum Traction {

    DIANTEIRA,
    TRASEIRA,
    AWD,
    QUATRO_POR_DOIS {
        @Override
        public String toString() {
            return "4x2";
        }
    },
    QUATRO_POR_QUATRO {
        @Override
        public String toString() {
            return "4x4";
        }
    };

}
