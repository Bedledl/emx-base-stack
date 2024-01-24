DESCRIPTION="Chat Server"
LICENSE="CLOSED"

inherit pkgconfig cmake
inherit qt6-cmake

DEPENDS += " qtbase wayland "

SRC_URI = "git://github.com/Bedledl/MsgServerQt.git;protocol=https;branch=master"
S = "${WORKDIR}/git"

SRCREV = "${AUTOREV}"

PVBASE := "${PV}"
PV = "${PVBASE}+${SRCPV}"

EXTRA_OECMAKE = ""
OECMAKE_GENERATOR = "Unix Makefiles"
