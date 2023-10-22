Feature: Menambahkan Produk ke Keranjang Belanja

  Scenario: Menambahkan produk ke keranjang belanja
    Given Saya berada di halaman produk
    When Saya memilih produk "Sepatu Olahraga"
    And Saya menambahkannya ke keranjang belanja
    Then Saya harus melihat "Sepatu Olahraga" dalam keranjang belanja
