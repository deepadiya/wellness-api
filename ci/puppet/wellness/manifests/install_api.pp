class wellness::install_api {

  package { 'openjdk-11-jdk':
    ensure => installed,
  }

  file { '/opt/wellness-api.jar':
    ensure => present,
    source => 'puppet:///modules/wellness/wellness-api.jar',
    mode   => '0755',
  }

  exec { 'run-wellness-api':
    command => 'nohup java -jar /opt/wellness-api.jar &',
    path    => ['/usr/bin', '/bin'],
    unless  => 'pgrep -f wellness-api.jar',
    require => File['/opt/wellness-api.jar'],
  }

}

