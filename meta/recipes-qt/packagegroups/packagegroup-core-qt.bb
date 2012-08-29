#
# Copyright (C) 2010  Intel Corporation. All rights reserved
#

DESCRIPTION = "Qt Tasks for Poky"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r3"

PACKAGES = "\
    packagegroup-core-qt-demos \
    packagegroup-core-qt-demos-dbg \
    packagegroup-core-qt-demos-dev \
    "

ALLOW_EMPTY = "1"

QTDEMOS ?= "quicky ${COMMERCIAL_QT} fotowall"
#QTDEMOS_disabled = "fotowall"

RDEPENDS_packagegroup-core-qt-demos = "${QTDEMOS}"