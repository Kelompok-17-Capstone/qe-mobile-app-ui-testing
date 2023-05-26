Feature: Wikipedia

  @Wikipedia
  Scenario: Mencari Cucumber di Wikipedia
    Given Aplikasi Wikipedia terbuka
    And Skip pemilihan bahasa
    And Klik search bar
    And Ketik "Quality Assurance Engineer" dan tekan enter
    And Pilih hasil yang pertama
    Then Artikel tentang Cucumber sudah muncul
