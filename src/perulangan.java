public class perulangan {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            // jika ingin menampilkan bilangan ganjil i%2 nya harus bernilai 1
            // nah sebaliknya jika ingin menampilkan bilangan genap tinggal ganti aja i%2
            // itu sama dengan 0
            if (i % 2 == 1) {
                // nah ini akan menampilkan bilangan ganjil
                System.out.println(i);
            }
        }
    }
}
