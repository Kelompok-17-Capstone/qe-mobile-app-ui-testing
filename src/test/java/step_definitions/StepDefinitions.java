package step_definitions;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static step_definitions.DriverHook.driver;

public class StepDefinitions {

    Faker faker = new Faker(new Locale("in-ID"));
    String randomEmail = faker.internet().emailAddress();
    String randomPassword = faker.internet().password();
    String randomFullName = faker.name().fullName();
    String randomTelNum = faker.phoneNumber().phoneNumber();
    String randomProvince = faker.address().state();
    String randomCity = faker.address().cityName();
    String randomAddress = faker.address().fullAddress();

    @Given("Aplikasi AltaTech terbuka")
    public void aplikasiAltaTechTerbuka() {
        assertEquals("com.example.alta_tech", driver.getCurrentPackage());
    }

    @When("Klik tombol Daftar Akun")
    public void klikTombolDaftarAkun() {
        WebElement buttonDaftarAkunLanding = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar Akun\"]"));
        buttonDaftarAkunLanding.click();
    }

    @And("Masuk ke halaman register")
    public void masukKeHalamanRegister() {
        WebElement pageTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Pendaftaran Akun\"]"));
        String register = pageTitle.getAttribute("content-desc");
        assertEquals("Pendaftaran Akun", register);
    }

    @And("Isi form field Register Alamat Email")
    public void isiFormFieldRegisterAlamatEmail() {
        WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]/android.widget.EditText"));
        emailField.click();
        emailField.sendKeys(randomEmail);
    }

    @And("Isi form field Register Kata Sandi")
    public void isiFormFieldRegisterKataSandi() {
        WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.EditText"));
        passwordField.click();
        passwordField.sendKeys(randomPassword);
    }

    @And("Isi form field Register Konfirmasi Kata Sandi")
    public void isiFormFieldRegisterKonfirmasiKataSandi() {
        WebElement confirmPasswordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]/android.widget.EditText"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys(randomPassword);
        driver.navigate().back();
    }

    @And("Klik tombol submit Daftar Akun")
    public void klikTombolSubmitDaftarAkun() {
        WebElement buttonDaftarAkunSubmit = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar Akun\"]"));
        buttonDaftarAkunSubmit.click();
    }

    @And("Masuk ke halaman isi data pribadi")
    public void masukKeHalamanIsiDataPribadi() {
        WebElement pageTitle = driver.findElement(AppiumBy.accessibilityId("Data Pribadi"));
        String dataPribadi = pageTitle.getAttribute("content-desc");
        assertEquals("Data Pribadi", dataPribadi);
    }

    @And("Isi form field Nama Lengkap")
    public void isiFormFieldNamaLengkap() {
        WebElement fullNameField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]/android.widget.EditText"));
        fullNameField.click();
        fullNameField.sendKeys(randomFullName);
    }

    @And("Isi form field Nomor Telepon")
    public void isiFormFieldNomorTelepon() {
        WebElement telNumField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.EditText"));
        telNumField.click();
        telNumField.sendKeys(randomTelNum);
    }

    @And("Isi form field Provinsi")
    public void isiFormFieldProvinsi() {
        WebElement provinceField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]/android.widget.EditText"));
        provinceField.click();
        provinceField.sendKeys(randomProvince);
        driver.navigate().back();
    }

    @And("Isi form field Kota")
    public void isiFormFieldKabupatenKota() {
        WebElement cityField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]/android.widget.EditText"));
        cityField.click();
        cityField.sendKeys(randomCity);
        driver.navigate().back();
    }

    @And("Isi form field Alamat")
    public void isiFormFieldAlamat() {
        WebElement addressField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]/android.widget.EditText"));
        addressField.click();
        addressField.sendKeys(randomAddress);
        driver.navigate().back();
    }

    @And("Klik tombol submit data pribadi")
    public void klikTombolSubmitDataPribadi() {
        WebElement buttonDataPribadiSubmit = driver.findElement(AppiumBy.accessibilityId("Submit"));
        buttonDataPribadiSubmit.click();
    }

    @And("Klik tombol next")
    public void klikTombolNext() {
        WebElement buttonNext = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        buttonNext.click();
    }

    @And("Klik tombol next kedua")
    public void klikTombolNextKedua() {
        WebElement buttonNextKedua = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));
        buttonNextKedua.click();
    }

    @And("Klik tombol finish")
    public void klikTombolFinish() {
        WebElement buttonFinish = driver.findElement(AppiumBy.accessibilityId("Finish"));
        buttonFinish.click();
    }

    @Then("Masuk ke halaman beranda")
    public void masukKeHalamanBeranda() {
        WebElement pageTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Produk Terbaru\"]"));
        String beranda = pageTitle.getAttribute("content-desc");
        assertEquals("Produk Terbaru", beranda);
    }

    @When("Klik teks di sini")
    public void klikTeksDiSini() {
        WebElement teksDiSini = driver.findElement(AppiumBy.accessibilityId("di sini"));
        teksDiSini.click();
    }

    @And("Masuk ke halaman login")
    public void masukKeHalamanLogin() {
        WebElement pageTitle = driver.findElement(AppiumBy.accessibilityId("Kembali Bergabung"));
        String login = pageTitle.getAttribute("content-desc");
        assertEquals("Kembali Bergabung", login);
    }

    @And("Isi form field Login Alamat Email")
    public void isiFormFieldLoginAlamatEmail() {
        WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]/android.widget.EditText"));
        emailField.click();
        emailField.sendKeys("test@mail.com");
    }

    @And("Isi form field Login Kata Sandi")
    public void isiFormFieldLoginKataSandi() {
        WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.EditText"));
        passwordField.click();
        passwordField.sendKeys("abcdefgh");
    }

    @And("Klik tombol submit Masuk Akun")
    public void klikTombolSubmitMasukAkun() {
        WebElement buttonMasukAkunSubmit = driver.findElement(AppiumBy.accessibilityId("Masuk Akun"));
        buttonMasukAkunSubmit.click();
    }

    @And("Klik navbar Member")
    public void klikNavbarMember() {
        WebElement buttonNavbarMember = driver.findElement(AppiumBy.accessibilityId("Member\n" + "Tab 3 of 3"));
        buttonNavbarMember.click();
    }

    @Then("Masuk ke halaman member")
    public void masukKeHalamanMember() {
        WebElement pageTitle = driver.findElement(AppiumBy.accessibilityId("Informasi Member"));
        String memberInformation = pageTitle.getAttribute("content-desc");
        assertEquals("Informasi Member", memberInformation);
    }

    @And("Klik tombol daftar member")
    public void klikTombolDaftarMember() {
        WebElement buttonDaftarMember = driver.findElement(AppiumBy.accessibilityId("Daftar Member"));
        buttonDaftarMember.click();
    }

    @Then("Melihat tombol cetak member")
    public void melihatTombolCetakMember() {
        WebElement buttonText = driver.findElement(AppiumBy.accessibilityId("Cetak Member"));
        String cetakMember = buttonText.getAttribute("content-desc");
        assertEquals("Cetak Member", cetakMember);
    }

    @And("Klik navbar produk")
    public void klikNavbarProduk() {
        WebElement buttonNavbarProduk = driver.findElement(AppiumBy.accessibilityId("Produk\n" + "Tab 2 of 3"));
        buttonNavbarProduk.click();
    }

    @And("Klik salah satu produk")
    public void klikSalahSatuProduk() {
        WebElement buttonContainerProduk = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Ergonomic Rubber Wallet\n" + "Rp 0\"])[1]"));
        buttonContainerProduk.click();
    }

    @Then("Lihat deskripsi produk")
    public void lihatDeskripsiProduk() {
        WebElement productDesc = driver.findElement(AppiumBy.accessibilityId("Deskripsi"));
        String deskripsi = productDesc.getAttribute("content-desc");
        assertEquals("Deskripsi", deskripsi);
    }

    @And("Klik tombol cetak member")
    public void klikTombolCetakMember() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1800));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), 530, 900));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement buttonCetakMember = driver.findElement(AppiumBy.accessibilityId("Cetak Member"));
        buttonCetakMember.click();
    }

    @And("Klik tombol simpan kartu")
    public void klikTombolSimpanKartu() {
        WebElement buttonSimpanKartu = driver.findElement(AppiumBy.accessibilityId("Simpan Kartu"));
        buttonSimpanKartu.click();
    }

    @Then("Lihat kartu yang telah disimpan")
    public void lihatKartuYangTelahDisimpan() {
        assertEquals("com.google.android.apps.photos", driver.getCurrentPackage());
    }

    @Then("Lihat teks scan barcode")
    public void lihatTeksScanBarcode() {
        WebElement textScan = driver.findElement(AppiumBy.accessibilityId("Scan Barcode"));
        String scanBarcode = textScan.getAttribute("content-desc");
        assertEquals("Scan Barcode", scanBarcode);
    }

    @When("Klik teks lewati")
    public void klikTeksLewati() {
        WebElement teksLewati = driver.findElement(AppiumBy.accessibilityId("Lewati"));
        teksLewati.click();
    }

    @Then("Lihat teks form can't be empty")
    public void lihatTeksFormCanTBeEmpty() {
        WebElement textEmptyEmail = driver.findElement(AppiumBy.accessibilityId("Email can't be empty"));
        String emailEmpty = textEmptyEmail.getAttribute("content-desc");
        assertEquals("Email can't be empty", emailEmpty);
        WebElement textEmptyPassword = driver.findElement(AppiumBy.accessibilityId("Password can't be empty"));
        String passwordEmpty = textEmptyPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", passwordEmpty);
    }

    @Then("Lihat teks email can't be empty")
    public void lihatTeksEmailCanTBeEmpty() {
        WebElement textEmptyEmail = driver.findElement(AppiumBy.accessibilityId("Email can't be empty"));
        String emailEmpty = textEmptyEmail.getAttribute("content-desc");
        assertEquals("Email can't be empty", emailEmpty);
    }

    @Then("Lihat teks password can't be empty")
    public void lihatTeksPasswordCanTBeEmpty() {
        WebElement textEmptyPassword = driver.findElement(AppiumBy.accessibilityId("Password can't be empty"));
        String passwordEmpty = textEmptyPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", passwordEmpty);
    }

    @And("Isi form field Login Alamat Email salah")
    public void isiFormFieldLoginAlamatEmailSalah() {
        WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]/android.widget.EditText"));
        emailField.click();
        emailField.sendKeys("salahsalahsalah@mailmailmail.com");
    }

    @And("Isi form field Login Kata Sandi salah")
    public void isiFormFieldLoginKataSandiSalah() {
        WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.EditText"));
        passwordField.click();
        passwordField.sendKeys("fdqrwefwef4tfws2");
    }

    @Then("Lihat teks Login Gagal Pastikan email dan password sudah benar")
    public void lihatTeksLoginGagalPastikanEmailDanPasswordSudahBenar() {
        WebElement textAlertSalah = driver.findElement(AppiumBy.accessibilityId("Login Gagal\n" + "Pastikan email dan password sudah benar"));
        String alertSalah = textAlertSalah.getAttribute("content-desc");
        assertEquals("Login Gagal\n" + "Pastikan email dan password sudah benar", alertSalah);
    }

    @And("Klik form field email")
    public void klikFormFieldEmail() {
        WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]/android.widget.EditText"));
        emailField.click();
    }

    @And("Isi form field Register Konfirmasi Kata Sandi invalid")
    public void isiFormFieldRegisterKonfirmasiKataSandiInvalid() {
        WebElement confirmPasswordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]/android.widget.EditText"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys("randomPassword");
        driver.navigate().back();
    }

    @Then("Lihat teks form tidak valid")
    public void lihatTeksFormTidakValid() {
        WebElement textAlertInvalid = driver.findElement(AppiumBy.accessibilityId("Form Tidak Valid\n" + "Pastikan password dan confirmation password sama"));
        String alertInvalid = textAlertInvalid.getAttribute("content-desc");
        assertEquals("Form Tidak Valid\n" + "Pastikan password dan confirmation password sama", alertInvalid);
    }

    @Then("Lihat teks register form can't be empty")
    public void lihatTeksRegisterFormCanTBeEmpty() {
        WebElement textEmptyEmail = driver.findElement(AppiumBy.accessibilityId("Email can't be empty"));
        String emailEmpty = textEmptyEmail.getAttribute("content-desc");
        assertEquals("Email can't be empty", emailEmpty);
        WebElement textEmptyPassword = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Password can't be empty\"])[1]"));
        String passwordEmpty = textEmptyPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", passwordEmpty);
        WebElement textEmptyConfirmPassword = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Password can't be empty\"])[2]"));
        String confirmPasswordEmpty = textEmptyConfirmPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", confirmPasswordEmpty);
    }

    @Then("Lihat teks register password can't be empty")
    public void lihatTeksRegisterPasswordCanTBeEmpty() {
        WebElement textEmptyPassword = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Password can't be empty\"])[1]"));
        String passwordEmpty = textEmptyPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", passwordEmpty);
        WebElement textEmptyConfirmPassword = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Password can't be empty\"])[2]"));
        String confirmPasswordEmpty = textEmptyConfirmPassword.getAttribute("content-desc");
        assertEquals("Password can't be empty", confirmPasswordEmpty);
    }

    @And("Klik form field register password")
    public void klikFormFieldRegisterPassword() {
        WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.EditText"));
        passwordField.click();
        WebElement confirmPasswordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]/android.widget.EditText"));
        confirmPasswordField.click();
        driver.navigate().back();
    }
}
