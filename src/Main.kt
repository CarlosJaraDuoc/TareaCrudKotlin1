import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val lista = mutableListOf("Pikachu", "Charmander", "Bulbasaur")
    val conjunto = mutableSetOf("Rojo", "Azul", "Verde")
    val mapa = mutableMapOf(1 to "Nintendo", 2 to "Sony", 3 to "Microsoft")

    while (true) {
        println("\n=== MENÚ PRINCIPAL ===")
        println("1. CRUD List")
        println("2. CRUD Set")
        println("3. CRUD Map")
        println("0. Salir")
        print("Elige una opción: ")

        when (scanner.nextInt()) {
            1 -> crudList(lista, scanner)
            2 -> crudSet(conjunto, scanner)
            3 -> crudMap(mapa, scanner)
            0 -> {
                println("Saliendo...")
                return
            }
            else -> println("Opción no válida")
        }
    }
}

// ---------------- CRUD List ----------------
fun crudList(lista: MutableList<String>, scanner: Scanner) {
    while (true) {
        println("\n--- CRUD LIST ---")
        println("1. Agregar")
        println("2. Leer")
        println("3. Actualizar")
        println("4. Eliminar")
        println("0. Volver al menú principal")
        print("Elige: ")

        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()
                print("Ingresa un elemento: ")
                val elem = scanner.nextLine()
                lista.add(elem)
            }
            2 -> println("Lista: $lista")
            3 -> {
                print("Índice a modificar: ")
                val idx = scanner.nextInt()
                if (idx in lista.indices) {
                    scanner.nextLine()
                    print("Nuevo valor: ")
                    val nuevo = scanner.nextLine()
                    lista[idx] = nuevo
                } else println("Índice inválido")
            }
            4 -> {
                scanner.nextLine()
                print("Elemento a eliminar: ")
                val elem = scanner.nextLine()
                lista.remove(elem)
            }
            0 -> return
            else -> println("Opción no válida")
        }
        println("Estado actual: $lista")
    }
}

// ---------------- CRUD Set ----------------
fun crudSet(conjunto: MutableSet<String>, scanner: Scanner) {
    while (true) {
        println("\n--- CRUD SET ---")
        println("1. Agregar")
        println("2. Leer")
        println("3. Actualizar")
        println("4. Eliminar")
        println("0. Volver al menú principal")
        print("Elige: ")

        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()
                print("Ingresa un elemento: ")
                val elem = scanner.nextLine()
                conjunto.add(elem)
            }
            2 -> println("Set: $conjunto")
            3 -> {
                scanner.nextLine()
                print("Elemento a reemplazar: ")
                val viejo = scanner.nextLine()
                if (conjunto.remove(viejo)) {
                    print("Nuevo valor: ")
                    val nuevo = scanner.nextLine()
                    conjunto.add(nuevo)
                } else println("No existe en el set")
            }
            4 -> {
                scanner.nextLine()
                print("Elemento a eliminar: ")
                val elem = scanner.nextLine()
                conjunto.remove(elem)
            }
            0 -> return
            else -> println("Opción no válida")
        }
        println("Estado actual: $conjunto")
    }
}

// ---------------- CRUD Map ----------------
fun crudMap(mapa: MutableMap<Int, String>, scanner: Scanner) {
    while (true) {
        println("\n--- CRUD MAP ---")
        println("1. Agregar")
        println("2. Leer")
        println("3. Actualizar")
        println("4. Eliminar")
        println("0. Volver al menú principal")
        print("Elige: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Clave (Int): ")
                val clave = scanner.nextInt()
                scanner.nextLine()
                print("Valor: ")
                val valor = scanner.nextLine()
                mapa[clave] = valor
            }
            2 -> println("Mapa: $mapa")
            3 -> {
                print("Clave a actualizar: ")
                val clave = scanner.nextInt()
                if (mapa.containsKey(clave)) {
                    scanner.nextLine()
                    print("Nuevo valor: ")
                    val nuevo = scanner.nextLine()
                    mapa[clave] = nuevo
                } else println("No existe la clave")
            }
            4 -> {
                print("Clave a eliminar: ")
                val clave = scanner.nextInt()
                mapa.remove(clave)
            }
            0 -> return
            else -> println("Opción no válida")
        }
        println("Estado actual: $mapa")
    }
}
