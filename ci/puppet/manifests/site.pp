node default {
  include wellness
}

class wellness {
  include wellness::install_api
}

