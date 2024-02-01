SUMMARY = "C/C++ Configuration File Library"
DESCRIPTION = "Library for manipulating structured configuration files"
HOMEPAGE = "https://hyperrealm.github.io/libconfig/"
BUGTRACKER = "https://github.com/hyperrealm/libconfig/issues"
SECTION = "libs"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=fad9b3332be894bab9bc501572864b29"

SRC_URI = "git://github.com/hyperrealm/libconfig.git;protocol=https;branch=master"
SRCREV = "020a9ce12d1be7ab79ca0674fc957e732ab67f4d"

S = "${WORKDIR}/git"

inherit autotools
