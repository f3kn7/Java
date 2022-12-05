-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.22-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para lexusbd
CREATE DATABASE IF NOT EXISTS `lexusbd` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `lexusbd`;

-- Copiando estrutura para tabela lexusbd.carro
CREATE TABLE IF NOT EXISTS `carro` (
  `id_carro` int(11) NOT NULL AUTO_INCREMENT,
  `id_carro_categoria` int(11) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `ano` varchar(50) NOT NULL DEFAULT '',
  `cor` varchar(50) NOT NULL,
  `qnt_passageiros` varchar(50) NOT NULL,
  `qnt_portas` varchar(50) NOT NULL,
  `cap_mala` varchar(50) NOT NULL,
  `tracao` varchar(50) NOT NULL,
  `motor` varchar(50) NOT NULL,
  `potencia` varchar(50) NOT NULL,
  `transmissao` varchar(50) NOT NULL,
  `tipo_combustivel` varchar(50) NOT NULL,
  `chassi` varchar(50) NOT NULL,
  `renavam` varchar(50) NOT NULL,
  `placa` varchar(50) NOT NULL,
  `km` double NOT NULL,
  `valor_aluguel` double NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_carro`) USING BTREE,
  UNIQUE KEY `chassi` (`chassi`),
  UNIQUE KEY `renavam` (`renavam`),
  UNIQUE KEY `placa` (`placa`),
  KEY `FK_carro_categoria` (`id_carro_categoria`),
  CONSTRAINT `FK_carro_categoria` FOREIGN KEY (`id_carro_categoria`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome_categoria` varchar(50) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.c_fisico
CREATE TABLE IF NOT EXISTS `c_fisico` (
  `id_fisico` int(11) NOT NULL AUTO_INCREMENT,
  `sexo` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  `rg` varchar(15) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `cnh` varchar(15) NOT NULL,
  PRIMARY KEY (`id_fisico`),
  CONSTRAINT `FK_c_fisico_pessoa` FOREIGN KEY (`id_fisico`) REFERENCES `pessoa` (`id_pessoa`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.c_juridico
CREATE TABLE IF NOT EXISTS `c_juridico` (
  `id_juridico` int(11) NOT NULL AUTO_INCREMENT,
  `id_juri_client_pessoa` int(11) NOT NULL,
  `cnpj` varchar(15) NOT NULL,
  PRIMARY KEY (`id_juridico`),
  KEY `FK_c_juridico_pessoa` (`id_juri_client_pessoa`),
  CONSTRAINT `FK_c_juridico_pessoa` FOREIGN KEY (`id_juri_client_pessoa`) REFERENCES `pessoa` (`id_pessoa`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.departamento
CREATE TABLE IF NOT EXISTS `departamento` (
  `id_departamento` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id_departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `id_func_pessoa` int(11) NOT NULL,
  `id_func_depart` int(11) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `data_nascimento` date NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `ctps` varchar(20) NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  KEY `FK_funcionario_pessoa` (`id_func_pessoa`) USING BTREE,
  KEY `FK_funcionario_departamento` (`id_func_depart`) USING BTREE,
  CONSTRAINT `FK_funcionario_departamento` FOREIGN KEY (`id_func_depart`) REFERENCES `departamento` (`id_departamento`),
  CONSTRAINT `FK_funcionario_pessoa` FOREIGN KEY (`id_func_pessoa`) REFERENCES `pessoa` (`id_pessoa`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.locacao
CREATE TABLE IF NOT EXISTS `locacao` (
  `id_locacao` int(11) NOT NULL AUTO_INCREMENT,
  `id_loca_cliente` int(11) NOT NULL,
  `id_loca_carro` int(11) NOT NULL,
  `data_retirada` datetime NOT NULL,
  `data_devolucao` datetime NOT NULL,
  `valor_total` double NOT NULL,
  PRIMARY KEY (`id_locacao`),
  KEY `FK_locacao_pessoa` (`id_loca_cliente`),
  KEY `FK_locacao_carro` (`id_loca_carro`),
  CONSTRAINT `FK_locacao_carro` FOREIGN KEY (`id_loca_carro`) REFERENCES `carro` (`id_carro`),
  CONSTRAINT `FK_locacao_pessoa` FOREIGN KEY (`id_loca_cliente`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lexusbd.pessoa
CREATE TABLE IF NOT EXISTS `pessoa` (
  `id_pessoa` int(11) NOT NULL AUTO_INCREMENT,
  `data_cadastro` date NOT NULL DEFAULT curdate(),
  `nome` varchar(100) NOT NULL,
  `telefone_fixo` varchar(20) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `whatsapp` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `rua` varchar(60) NOT NULL,
  `nr_predio_condominio` varchar(15) NOT NULL,
  `nr_residencia` varchar(15) NOT NULL,
  `bairro` varchar(60) NOT NULL,
  `cidade` varchar(60) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pessoa`) USING BTREE,
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
