import React from 'react';
import { BsArrowUpRight } from 'react-icons/bs'
import { motion } from 'framer-motion'
import { fadeIn } from '../variants'

const knowledge = [
  {
    name: 'Technologist in computer systems analysis and development.',
    description: 'I as a technologist in computer systems analysis and development is a professional who focuses on the design, development, implementation and maintenance of computer systems to meet business and user needs.',
    moreInfo: 'Link',
    certified: 'https://drive.google.com/file/d/1d7_4E2qdOfVD8a-q1bUih-G-MYPBiWxO/view?usp=drive_link'
  },
  {
    name: 'Electronics Technologist',
    description: 'The knowledge acquired as an electronics technologist allows me to participate in the design, development, installation, maintenance and troubleshooting in various areas, such as consumer electronics, telecommunications, industrial automation, medical electronics, power systems, among others.',
    moreInfo: 'Link',
    certified: 'https://drive.google.com/file/d/1WngBo3rX4iUvlqhneVNXYCNldY7a8Ykj/view?usp=drive_link'
  },
  {
    name: 'Technologist in Industrial Automation',
    description: 'As a technologist in Industrial Automation I acquired specialized knowledge and skills to design, implement, maintain and optimize automated systems used in various industrial processes.',
    moreInfo: 'Link',
    certified: 'https://drive.google.com/file/d/1PHDz74zn0-pEPO4R4BjxwPymHKCpMmdZ/view?usp=drive_link'
  },
  {
    name: 'Systems Technician',
    description: 'As a systems technician, I acquired a set of knowledge and skills that enable me to provide technical support, troubleshoot problems and maintain the proper functioning of computer systems and networks.',
    moreInfo: 'Link',
    certified: 'https://drive.google.com/file/d/13m2s5H10kJtjPZmII0vTUpvmONlQ0LdR/view?usp=drive_link'
  }
]

const Knowledge = () => {
  return (
    <section className='section' id='knowledge'>
      <div className='container mx-auto'>
        <div className='flex flex-col lg:flex-row'>
          <motion.div
            variants={fadeIn('right', 0.3)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.3 }}
            className='flex-1 lg:bg-services lg:bg-bottom bg-no-repeat 
          mix-blend-lighten mb-12 lg:mb-0'>
            <h2 className='h2 text-accent mb-6'>My certified knowledge</h2>
            <h3 className='h3 max-w-[455px] mb-16'>I'm Certified in:</h3>
            <a className='py-3 btn btn-sm max-w-sm text-center'  href='https://drive.google.com/drive/folders/1-WqMPket5WBdhmNdqHmThI6VRK1Zq6P8'>See all certificate</a>
          </motion.div>
          <div className='flex-1'>
            <motion.div
            variants={fadeIn('left', 0.3)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.3 }}>
              {knowledge.map((knowledge, index) => {
                const { name, description, moreInfo, certified } = knowledge;
                return (
                  <div className=' lg:h-29 mb-[38px] sm-h:40 flex' key={index}>
                    <div className='max-w-[676px]'>
                      <h4 className='text--[20px] tracking-wider font-primary font-semibold mb-3'>{name}</h4>
                      <p className='font-secondary leading-tight max-w-sm'>{description}</p>
                    </div>
                    <div className='flex flex-col flex-1 items-end'>
                      <a href={certified} className='btn w-9 h-9 mb-[10px] flex justify-center items-center'>
                        <BsArrowUpRight />
                      </a>
                      <a href={certified} className='text-gradient text-sm text-center'>{moreInfo}</a>
                    </div>
                  </div>
                )
              })}
            </motion.div>
          </div>
        </div>
      </div>
    </section>
    );
};

export default Knowledge;
