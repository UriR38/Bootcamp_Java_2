-- MySQL Script generated by MySQL Workbench
-- Tue Jul  9 17:55:02 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Artist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Artist` (
  `idArtist` INT NOT NULL,
  `artistName` VARCHAR(45) NULL,
  PRIMARY KEY (`idArtist`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Album`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Album` (
  `idAlbum` INT NOT NULL,
  `albumName` VARCHAR(45) NULL,
  `dateReleased` DATETIME NULL,
  `Artist_idArtist` INT NOT NULL,
  PRIMARY KEY (`idAlbum`),
  INDEX `fk_Album_Artist1_idx` (`Artist_idArtist` ASC) VISIBLE,
  CONSTRAINT `fk_Album_Artist1`
    FOREIGN KEY (`Artist_idArtist`)
    REFERENCES `mydb`.`Artist` (`idArtist`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Gnere`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Gnere` (
  `idGnere` INT NOT NULL,
  `Genere` VARCHAR(45) NULL,
  `Album_idAlbum` INT NOT NULL,
  PRIMARY KEY (`idGnere`),
  INDEX `fk_Gnere_Album_idx` (`Album_idAlbum` ASC) VISIBLE,
  CONSTRAINT `fk_Gnere_Album`
    FOREIGN KEY (`Album_idAlbum`)
    REFERENCES `mydb`.`Album` (`idAlbum`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;