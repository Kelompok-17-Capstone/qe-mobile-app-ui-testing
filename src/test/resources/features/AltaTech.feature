Feature: AltaTech Mobile App

  @Register
  Scenario: Menguji fitur register aplikasi AltaTech
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Isi form field Register Alamat Email
    And Isi form field Register Kata Sandi
    And Isi form field Register Konfirmasi Kata Sandi
    And Klik tombol submit Daftar Akun
    And Masuk ke halaman isi data pribadi
    And Isi form field Nama Lengkap
    And Isi form field Nomor Telepon
    And Isi form field Provinsi
    And Isi form field Kota
    And Isi form field Alamat
    And Klik tombol submit data pribadi
    And Klik tombol next
    And Klik tombol next kedua
    And Klik tombol finish
    Then Masuk ke halaman beranda

  @Login
  Scenario: Menguji fitur login aplikasi AltaTech
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email
    And Isi form field Login Kata Sandi
    And Klik tombol submit Masuk Akun
    Then Masuk ke halaman beranda

  @InformasiMember
  Scenario: Menguji fitur lihat informasi member
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email
    And Isi form field Login Kata Sandi
    And Klik tombol submit Masuk Akun
    And Klik navbar Member
    Then Masuk ke halaman member

  @RegisterMember
  Scenario: Menguji fitur register member
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Isi form field Register Alamat Email
    And Isi form field Register Kata Sandi
    And Isi form field Register Konfirmasi Kata Sandi
    And Klik tombol submit Daftar Akun
    And Masuk ke halaman isi data pribadi
    And Isi form field Nama Lengkap
    And Isi form field Nomor Telepon
    And Isi form field Provinsi
    And Isi form field Kota
    And Isi form field Alamat
    And Klik tombol submit data pribadi
    And Klik tombol next
    And Klik tombol next kedua
    And Klik tombol finish
    And Masuk ke halaman beranda
    And Klik navbar Member
    And Masuk ke halaman member
    And Klik tombol daftar member
    Then Lihat teks scan barcode

  @ViewProduct(User)
  Scenario: Menguji fitur melihat produk oleh user aplikasi AltaTech
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email
    And Isi form field Login Kata Sandi
    And Klik tombol submit Masuk Akun
    And Masuk ke halaman beranda
    And Klik navbar produk
    And Klik salah satu produk
    Then Lihat deskripsi produk

  @ViewProduct(Guest)
  Scenario: Menguji fitur melihat produk oleh huest aplikasi AltaTech
    Given Aplikasi AltaTech terbuka
    When Klik teks lewati
    And Masuk ke halaman beranda
    And Klik navbar produk
    And Klik salah satu produk
    Then Lihat deskripsi produk

  @GetMemberCardInPNGFormat
  Scenario: Menguji fitur mendapatkan member card dalam format png
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email
    And Isi form field Login Kata Sandi
    And Klik tombol submit Masuk Akun
    And Klik navbar Member
    And Masuk ke halaman member
    And Klik tombol cetak member
    And Klik tombol simpan kartu
    Then Lihat kartu yang telah disimpan

  @LoginEmpty
  Scenario: Menguji fitur login aplikasi AltaTech email dan password tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Klik tombol submit Masuk Akun
    Then Lihat teks form can't be empty

  @LoginEmailEmpty
  Scenario: Menguji fitur login aplikasi AltaTech email tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Klik form field email
    And Isi form field Login Kata Sandi
    And Klik tombol submit Masuk Akun
    Then Lihat teks email can't be empty

  @LoginPasswordEmpty
  Scenario: Menguji fitur login aplikasi AltaTech password tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email
    And Klik tombol submit Masuk Akun
    Then Lihat teks password can't be empty

  @LoginEmail/PasswordSalah
  Scenario: Menguji fitur login aplikasi AltaTech email/password salah
    Given Aplikasi AltaTech terbuka
    When Klik teks di sini
    And Masuk ke halaman login
    And Isi form field Login Alamat Email salah
    And Isi form field Login Kata Sandi salah
    And Klik tombol submit Masuk Akun
    Then Lihat teks Login Gagal Pastikan email dan password sudah benar

  @RegisterPasswordTidakSama
  Scenario: Menguji fitur register aplikasi AltaTech confirmation password berbeda
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Isi form field Register Alamat Email
    And Isi form field Register Kata Sandi
    And Isi form field Register Konfirmasi Kata Sandi invalid
    And Klik tombol submit Daftar Akun
    Then Lihat teks form tidak valid

  @RegisterEmpty
  Scenario: Menguji fitur register aplikasi AltaTech email dan password tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Klik tombol submit Daftar Akun
    Then Lihat teks register form can't be empty

  @RegisterEmailEmpty
  Scenario: Menguji fitur register aplikasi AltaTech email tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Klik form field email
    And Isi form field Register Kata Sandi
    And Isi form field Register Konfirmasi Kata Sandi
    And Klik tombol submit Daftar Akun
    Then Lihat teks email can't be empty

  @RegisterPasswordEmpty
  Scenario: Menguji fitur register aplikasi AltaTech password tidak diisi
    Given Aplikasi AltaTech terbuka
    When Klik tombol Daftar Akun
    And Masuk ke halaman register
    And Isi form field Register Alamat Email
    And Klik form field register password
    And Klik tombol submit Daftar Akun
    Then Lihat teks register password can't be empty