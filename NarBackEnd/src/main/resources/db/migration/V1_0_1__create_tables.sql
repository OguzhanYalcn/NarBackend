CREATE TABLE kullanicilar (
  id BINARY(16) NOT NULL,
  kullanici_adi VARCHAR(45) NULL,
  sifre VARCHAR(200) NULL,
  PRIMARY KEY (id));
  
CREATE TABLE roller (
  id BINARY(16) NOT NULL,
  rol VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX rol_unq (rol ASC) VISIBLE);
  
CREATE TABLE kullanici_rol (
  kullanici_id BINARY(16) NOT NULL,
  rol_id BINARY(16) NOT NULL,
  PRIMARY KEY (kullanici_id, rol_id),
  INDEX kul_rol_rol_fk_idx (rol_id ASC) VISIBLE,
  CONSTRAINT kul_rol_kul_fk
    FOREIGN KEY (kullanici_id)
    REFERENCES kullanicilar (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT kul_rol_rol_fk
    FOREIGN KEY (rol_id)
    REFERENCES roller (id));

 CREATE TABLE `nar`.`yazilim_ilan` (
  `id` BINARY(16) NOT NULL,
  `isim` VARCHAR(45) NOT NULL,
  `soyisim` VARCHAR(45) NOT NULL,
  `yazilim_dili` SMALLINT(2) NOT NULL,
  `is_tanimi` VARCHAR(200) NOT NULL,
  `sure` VARCHAR(45) NOT NULL,
  `ucret` DECIMAL(15,2) NOT NULL,
  PRIMARY KEY (`id`));