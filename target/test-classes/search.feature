Feature: Pencarian Produk

  Scenario: Pencarian produk berhasil
    Given Saya berada di halaman produk
    When Saya melakukan pencarian produk dengan kata kunci "sepatu"
    Then Saya harus melihat hasil pencarian produk yang sesuai

  Scenario: Pencarian produk tidak menghasilkan hasil
    Given Saya berada di halaman produk
    When Saya melakukan pencarian produk dengan kata kunci "barangtidakada"
    Then Saya harus melihat pesan "Tidak ada hasil yang ditemukan"
